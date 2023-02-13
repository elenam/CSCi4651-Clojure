(ns csci4651.core-test
  (:require [clojure.test :refer :all]
            [csci4651.core :refer :all]))

(deftest let-test
  (testing "Testing intro-let"
    (is (intro-let [1 2 3]) 3)
    (is (intro-let [5]) 5)
    (is (intro-let []) 0)))
