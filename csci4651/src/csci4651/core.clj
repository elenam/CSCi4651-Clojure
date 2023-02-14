(ns csci4651.core)

(defn hello []
  (println "Hi there"))

;; Example of using let:
(defn intro-let
  "The function gives an example of using let. It takes a collection of numbers
   and returns the sum of the first two elements."
   [coll]
   (let [x (if (not (empty? coll)) (first coll) 0)
         y (if (not (empty? (rest coll))) (second coll) 0)]
         (+ x y)))

;(println (intro-let [1 2 3]))

;; Using destructuring:
(defn destr1 [[x y & more]]
      (+ x y)) ; note: this will break if there's fewer than two items in the collection

(defn destr2 [[x y & more]]
      (+ (or x 0) (or y 0))) ; why does it work?

(defn destr3 [[x y & _]] ; don't need the rest of the elements in the vector
      (+ (or x 0) (or y 0)))

;; multi-arity functions:
(defn greeting
  ([first-name] (str "Hello, " first-name))
  ([first-name last-name] (str "Hello, " first-name " " last-name)))

;; Use of apply:
(+ 3 4 5) ; works
;(+ [3 4 5]) ; doesn't
;; If you are given a collection of items, you can use apply:
(apply + [3 4 5]) ; same as (+ 3 4 5)

;; variadic functions (functions with variable number of arguments)

(defn sum
  "Takes any number of arguments and adds them together"
  ([] 0)
  ([x] x)
  ([x & xs] (+ x (apply sum xs)))) ; note implicit recursion, although not tail-recursion

;; Java interop - calling Java from clojure
(defn multInv [num1 num2]
  "The function takes two numbers as strings and finds the multiplicative inverse
   of the first modulo the second"
   (.modInverse (BigInteger. num1) (BigInteger. num2)))

;; How do we check the answer? Write an expression using Java interop (don't forget to print)
