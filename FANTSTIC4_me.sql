
CREATE TABLE ANS_NO
(
  ANS_NO INT          NOT NULL,
  ANS    VARCHAR(200) NULL    ,
  PRIMARY KEY (ANS_NO)
) COMMENT '답항번호';

CREATE TABLE NAME_NO
(
  NAME_NO INT          NOT NULL,
  NAME    VARCHAR(200) NULL    ,
  PRIMARY KEY (NAME_NO)
) COMMENT '이름';

CREATE TABLE NAME_SURV
(
  NAME_NO INT NOT NULL,
  SURV_NO INT NOT NULL,
  PRIMARY KEY (NAME_NO)
) COMMENT '이름_설문';

CREATE TABLE RESULT
(
  NAME_NO INT NOT NULL,
  SURV_NO INT NOT NULL,
  ANS_NO  INT NOT NULL
) COMMENT '번호취합';

CREATE TABLE SURV_ANS
(
  SURV_NO INT NOT NULL,
  ANS_NO  INT NOT NULL,
  PRIMARY KEY (SURV_NO, ANS_NO)
) COMMENT '설문_답항';

CREATE TABLE SURV_NO
(
  SURV_NO INT          NOT NULL,
  SURV    VARCHAR(200) NOT NULL,
  PRIMARY KEY (SURV_NO)
) COMMENT '문항번호';

ALTER TABLE NAME_SURV
  ADD CONSTRAINT FK_NAME_NO_TO_NAME_SURV
    FOREIGN KEY (NAME_NO)
    REFERENCES NAME_NO (NAME_NO);

ALTER TABLE NAME_SURV
  ADD CONSTRAINT FK_SURV_NO_TO_NAME_SURV
    FOREIGN KEY (SURV_NO)
    REFERENCES SURV_NO (SURV_NO);

ALTER TABLE SURV_ANS
  ADD CONSTRAINT FK_SURV_NO_TO_SURV_ANS
    FOREIGN KEY (SURV_NO)
    REFERENCES SURV_NO (SURV_NO);

ALTER TABLE SURV_ANS
  ADD CONSTRAINT FK_ANS_NO_TO_SURV_ANS
    FOREIGN KEY (ANS_NO)
    REFERENCES ANS_NO (ANS_NO);

ALTER TABLE RESULT
  ADD CONSTRAINT FK_NAME_SURV_TO_RESULT
    FOREIGN KEY (NAME_NO)
    REFERENCES NAME_SURV (NAME_NO);

ALTER TABLE RESULT
  ADD CONSTRAINT FK_SURV_ANS_TO_RESULT
    FOREIGN KEY (SURV_NO, ANS_NO)
    REFERENCES SURV_ANS (SURV_NO, ANS_NO);
