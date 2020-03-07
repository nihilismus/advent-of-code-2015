(ns day03.solutions-test
  (:require [clojure.test :refer :all]
            [day03.solutions :refer :all]))

(deftest test-01-01
  (testing "Test 01 - 01"
    (is (= (solution1 ">") 2))))

(deftest test-01-02
  (testing "Test 01 - 02"
    (is (= (solution1 "^>v<") 4))))

(deftest test-01-03
  (testing "Test 01 - 03"
    (is (= (solution1 "^v^v^v^v^v") 2))))

(deftest test-01-04
  (testing "Test 01 - 04"
    (is (= (solution1 "") 1))))

(deftest test-01-05
  (testing "Test 01 - 05"
    (is (= (solution1 "^^>v<^>v<") 5))))

(deftest test-02-01
  (testing "Test 02 - 01"
    (is (= (solution2 "^v") 3))))

(deftest test-02-02
  (testing "Test 02 - 02"
    (is (= (solution2 ">v<") 3))))

(deftest test-02-03
  (testing "Test 02 - 03"
    (is (= (solution2 "^v^v^v^v^v") 11))))

(deftest test-02-04
  (testing "Test 02 - 04"
    (is (= (solution2 "") 1))))

(deftest test-02-05
  (testing "Test 02 - 05"
    (is (= (solution2 "^^>>^^>>") 5))))
