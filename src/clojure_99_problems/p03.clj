(ns clojure-99-problems.p03)

;; Find the kth element of a list
;; the list has 0-based index
;; Recurse each level with a decremented value of k
;; Base case is when k = 0, return the first element

(defn find-kth 
  [in-list k]
  (if (= k 0)
    (first in-list)
    (find-kth (rest in-list) (- k 1))))

;; Trivial test
(find-kth '(1 2 3 4) 2)
