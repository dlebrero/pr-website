(ns pr-website.query
  (:require [pr-website.database]
            [korma.core :refer :all]))

(defentity EXPERIENCIAS)

(defn get-experiencias []
  (select EXPERIENCIAS))

(defn add-experiencia [dataInicio dataFim empresa titulo principaisAtividades]
  (insert EXPERIENCIAS
          (values {:DATA_INICIO           dataInicio
                   :DATA_FIM              dataFim
                   :EMPRESA               empresa
                   :TITULO                titulo
                   :PRINCIPAIS_ATIVIDADES principaisAtividades})))