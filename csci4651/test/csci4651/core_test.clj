(ns csci4651.core-test
  (:require [clojure.test :refer :all]
            [csci4651.core :refer :all]))

;; See https://clojuredocs.org/clojure.test/deftest for deftest macro
;; description

(deftest let-test
  (testing "Testing intro-let"
    (is (intro-let [1 2 3]) 3)
    (is (intro-let '(1 2 3)) 3)
    (is (intro-let [5]) 5)
    (is (intro-let []) 0)))

(deftest destr1-test
  (testing "Testing the first version of destructuring"
    (is (destr1 [1 2 3]) 3)
    (is (destr1 '(1 2 3)) 3)))

(deftest destr2-test
  (testing "Testing the second version of destructuring"
    (is (destr2 [1 2 3]) 3)
    (is (destr2 '(1 2 3)) 3)
    (is (destr2 []) 0)
    (is (destr2 [1]) 1)))

(deftest greeting-test
  (testing "Testing the greeting function"
    (is (greeting "Jane") "Hello, Jane")
    (is (greeting "Jane" "Smith") "Hello, Jane Smith")))

(deftest sum-test
  (testing "Testing the sum function"
    (is (sum) 0)
    (is (sum 2) 2)
    (is (sum 1 2 3 4) 10)))
