(ns clojure-99-problems.p08)

;; Eliminate consecutive duplicates of list elements.
;; compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
;; returns, '('a, 'b, 'c, 'a, 'd, 'e)

(defn compress [a-seq]
  (cond 
    (empty? a-seq) '()
    :else (let [val (first a-seq)]
            ;; drop-while is the secret sauce, drops all values from a list
            ;; till the predicate remains true
            (cons val (compress (drop-while (fn [x]
                                              (= x val)) a-seq))))))


;; Trivial tests

(compress [1 2 3])

(compress [1 2 3 3])

(compress [1 1 2 3 3])

(compress [1 1 2 2 2 2 3 3 2 2])

(compress [])

(compress [1 1 1 1])
