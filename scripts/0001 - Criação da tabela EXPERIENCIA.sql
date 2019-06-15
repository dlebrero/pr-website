CREATE TABLE EXPERIENCIA (# Introduction to pr-website

TODO: write [great documentation](http://jacobian.org/writing/what-to-write/)

  ID MEDIUMINT NOT NULL AUTO_INCREMENT,
  DATA_INICIO DATE,
  DATA_FIM DATE,
  EMPRESA varchar(50),
  TITULO varchar(100),
  PRINCIPAIS_ATIVIDADES varchar(500),
  primary key (ID)
);