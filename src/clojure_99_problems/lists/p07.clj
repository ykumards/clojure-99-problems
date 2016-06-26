(ns clojure-99-problems.p07)

;; Flatten a nested list structure.
;; (flatten '(1 '(2 3) 5 )) returns '(1 2 3 5)

(defn flatten [x]
    (reduce
        (fn [accu e]
            (if (list? e)
                (concat acc (flatten e))
                (concat acc (list e))))
        '()
        x
    ))

;; trivial tests
(flatten '(1 2 3))

(flatten '(1 (2 3) 5 ((1))))
