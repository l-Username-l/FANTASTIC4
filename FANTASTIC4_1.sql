
CREATE TABLE 답항 번호
(
  답항번호  NOT NULL,
  답항    NULL    ,
  PRIMARY KEY (답항번호)
);

CREATE TABLE 번호취합
(
  이름 고유번호  NOT NULL,
  설문 고유번호  NOT NULL,
  답항번호     NOT NULL
);

CREATE TABLE 설문 번호부여
(
  설문 고유번호  NOT NULL,
  설문       NOT NULL,
  PRIMARY KEY (설문 고유번호)
);

CREATE TABLE 설문-답항
(
  설문 고유번호  NOT NULL,
  답항번호     NOT NULL,
  PRIMARY KEY (설문 고유번호, 답항번호)
);

CREATE TABLE 이름 번호부여
(
  이름 고유번호  NOT NULL,
  이름       NULL    ,
  PRIMARY KEY (이름 고유번호)
);

CREATE TABLE 이름-설문
(
  이름 고유번호  NOT NULL,
  설문 고유번호  NOT NULL,
  PRIMARY KEY (이름 고유번호)
);

ALTER TABLE 이름-설문
  ADD CONSTRAINT FK_이름 번호부여_TO_이름-설문
    FOREIGN KEY (이름 고유번호)
    REFERENCES 이름 번호부여 (이름 고유번호);

ALTER TABLE 이름-설문
  ADD CONSTRAINT FK_설문 번호부여_TO_이름-설문
    FOREIGN KEY (설문 고유번호)
    REFERENCES 설문 번호부여 (설문 고유번호);

ALTER TABLE 설문-답항
  ADD CONSTRAINT FK_설문 번호부여_TO_설문-답항
    FOREIGN KEY (설문 고유번호)
    REFERENCES 설문 번호부여 (설문 고유번호);

ALTER TABLE 설문-답항
  ADD CONSTRAINT FK_답항 번호_TO_설문-답항
    FOREIGN KEY (답항번호)
    REFERENCES 답항 번호 (답항번호);

ALTER TABLE 번호취합
  ADD CONSTRAINT FK_이름-설문_TO_번호취합
    FOREIGN KEY (이름 고유번호)
    REFERENCES 이름-설문 (이름 고유번호);

ALTER TABLE 번호취합
  ADD CONSTRAINT FK_설문-답항_TO_번호취합
    FOREIGN KEY (설문 고유번호, 답항번호)
    REFERENCES 설문-답항 (설문 고유번호, 답항번호);
