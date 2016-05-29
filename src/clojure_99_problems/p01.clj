(ns clojure-99-problems.p01)

;; Given a list return the last element of the list
;; Key is to use the 'first' method recursively and
;; return the value when the list is empty

(defn find-last
  [in-list]
  (if (= 1 (count in-list))
    (first in-list)
    (find-last (rest in-list)))) ;; rest returns the whole list except the first element


;; Trivial test
(find-last '(1 2 3 4))

