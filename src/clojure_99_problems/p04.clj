(ns clojure-99-problems.p04)

;; Find the number of elements in a given list
;; Base case is when list is empty
;; Recurse by adding 1 to the return value for each level
(defn count-list
  [in-list]
  (if (empty? in-list)
    0
    (+ 1 (count-list (rest in-list)))))

;; Trivial tests
(count-list '()) ;; returns 0
(count-list '(1 2 3 4)) ;; returns 4
