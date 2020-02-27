(ns day01.solutions-test
  (:require [clojure.test :refer :all]
            [day01.solutions :refer :all]))

(deftest test-01-01
  (testing "Test 01 - 01"
    (is (= (solution1 "(())") 0))))

(deftest test-01-02
  (testing "Test 01 - 02"
    (is (= (solution1 "(((") 3))))

(deftest test-01-03
  (testing "Test 01 - 03"
    (is (= (solution1 "()()") 0))))

(deftest test-01-04
  (testing "Test 01 - 04"
    (is (= (solution1 ")))(((") 0))))

(deftest test-01-05
  (testing "Test 01 - 05"
    (is (= (solution1 ")))((((((") 3))))

(deftest test-01-06
  (testing "Test 01 - 06"
    (is (= (solution1 "((()))(((") 3))))

(deftest test-02-01
  (testing "Test 02 - 01"
    (is (= (solution2 "()())") 5))))

(deftest test-02-02
  (testing "Test 02 - 02"
    (is (= (solution2 ")") 1))))

(deftest test-02-03
  (testing "Test 02 - 03"
    (is (= (solution2 "(((())))))") 9))))

(deftest test-02-04
  (testing "Test 02 - 04"
    (is (= (solution2 "(())()))))") 7))))

(deftest test-02-05
  (testing "Test 02 - 05"
    (is (= (solution2 "(())(())(()))(((") 13))))

(deftest test-02-06
  (testing "Test 02 - 06"
    (is (= (solution2 "())") 3))))
