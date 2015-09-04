(ns forca.core (:gen-class))

(def total-de-vidas 6)

(defn loose
  []
  (println "You loose!")
  )

(defn win
  []
  (println "You Win!")
  )

(defn letras-faltantes [palavra acertos]
  (remove (fn [letra] (contains? acertos (str letra)) ) palavra)
  )

(defn acertou-palavra-completa? [palavra acertos] 
  (empty? (letras-faltantes palavra acertos))
  )

(defn le-letra! [] 
  (println "Chute uma letra")
  (read-line))

(defn acertou? [chute palavra] (.contains palavra chute))

(defn imprime-forca [vidas palavra acertos]
    (println : "Vidas " vidas)
    (doseq [letra (seq palavra)]
        (if (contains? acertos (str letra))
            (print letra " ") (print "_" " ")))
    (println))

(defn jogo [vidas palavra acertos]
  (imprime-forca vidas palavra acertos)
    (cond
        (= vidas 0) (loose)
        (acertou-palavra-completa? palavra acertos) (win)
        :else   
        (let [chute (le-letra!)]
            (if (acertou? chute palavra)
                (do
                    (println "Acertou a letra!")
                    (recur vidas palavra (conj acertos chute)))
                (do
                    (println "Errou a letra! Perdeu vida!")
                    (recur (dec vidas) palavra acertos))))))




