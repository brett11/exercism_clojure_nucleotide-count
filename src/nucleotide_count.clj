(ns nucleotide_count)

(defn count [c s]
  (if (not-any? #(= c %) '(\A \T \C \G))
    (throw Throwable)
    (clojure.core/count (filter #(= % c) s))))

(defn nucleotide-counts [s]
  (zipmap
    [\A \T \C \G]
    (map #(count % s) [\A \T \C \G])))