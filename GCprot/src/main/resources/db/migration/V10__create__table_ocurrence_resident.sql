CREATE TABLE occurrence_resident (
  id INT NOT NULL AUTO_INCREMENT  PRIMARY KEY,
  resident_id INT NOT NULL,
  occurrence_id INT NOT NULL,

  FOREIGN KEY (resident_id) REFERENCES resident (id) ON DELETE CASCADE,
  FOREIGN KEY (occurrence_id) REFERENCES occurrence (id) ON DELETE CASCADE
);