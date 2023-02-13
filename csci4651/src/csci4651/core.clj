(ns csci4651.core)

(defn hello []
  (println "Hi there"))

;; Example of using let:
(defn intro-let [coll]
  "The function gives an example of using let. It takes a collection of numbers
   and returns the sum of the first two elements."
  (let [x (if (not (empty? coll)) (first coll) 0)
        y (if (not (empty? (rest coll))) (second coll) 0)]
        (+ x y)))

(println (intro-let [1 2 3]))
