(ns exer(:gen-class))

(def numeros [1 2 3 4 5])

(def carros [50000.0 60000.0])

(defn pares [numeros]
  (remove (fn [nro] (= (rem nro 2) 1)) numeros)
  )

(defn mult [numeros]
  (map (fn [nro] (* 3 nro)) numeros)
  )

(defn filtra [numeros]
  (filter (fn [x] (or (< x 2) (> x 4))) numeros)
  )

(def palavra "ALURA")

(defn contem [palavra letras]
  (map (fn [letra] (contains? letras (str letra)) ) palavra)
  )


(->> carros 
    (map (fn [x] (* x 2))) 
    (map (fn [x] (* x 3))) 
    (reduce (fn [acc n] (+ acc n))))

