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

(defn jogo [vidas palavra acertos]
  (if(= vidas 0)
    (loose)
    (if(acertou-palavra-completa? palavra acertos)
      (win)
      (avalia-chute (le-letra!) vidas palavra acertos)
      
      )
    
    )  
  )

(defn avalia-chute [chute vidas palavra acertos]
  (if (acertou? chute palavra)
    (jogo vidas palavra (conj acertos chute))
    (jogo (dec vidas) palavra acertos)
    )
  )




