(ns clojure-99-problems.p06)

;; Find out whether a list is a palindrome.
;; isPalin(List(1, 2, 3, 2, 1)) should print true

(defn isPalin
  [in-list]
  (if (= in-list (reverse in-list))
    true
    false))


;; Trivial tests
(isPalin '(1 2 3 2 1))

(isPalin '(1))

(isPalin '(1 2))
