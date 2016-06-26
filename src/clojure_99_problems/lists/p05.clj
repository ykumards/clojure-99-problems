(ns clojure-99-problems.p05)

;; Reverse a list
;; (rev '(1 2 3 4)) should return (4 3 2 1)

(defn myrev
  [in-list]
  (if (empty? in-list)
    '()
    (distinct (concat (myrev (rest in-list)) (list (first in-list))))))

;; Test cases
(myrev '())

(myrev '(1))

(myrev '(1 2 3 4 5))


;; We can also write a tail-recursive version

(defn myrev-tail
  [in-list]
  (defn helper 
    [in-list acc]
    (if (empty? in-list)
      acc
      (helper (rest in-list) (cons (first in-list) acc)))
    )
  (helper in-list '())
  )

(myrev-tail '(1 2 3 4))
