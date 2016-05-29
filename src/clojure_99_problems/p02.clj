(ns clojure-99-problems.p02)

;; Find the last but one element of a gievn list
;; (second-last '(1 2 3 4)) should return 3
;; Same as the previous problem, just check for a higher list size
(defn second-last
  [in-list]
  (if (= 2 (count in-list))
    (first in-list)
    (second-last (rest in-list))))


;; Trivial test
(second-last '(1 2 3 4))
