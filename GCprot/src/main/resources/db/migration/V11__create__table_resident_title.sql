CREATE TABLE resident_title (
  id INT NOT NULL AUTO_INCREMENT  PRIMARY KEY,
  resident_id INT NOT NULL,
  title_id INT NOT NULL,

  FOREIGN KEY (resident_id) REFERENCES resident (id) ON DELETE CASCADE,
  FOREIGN KEY (title_id) REFERENCES title (id) ON DELETE CASCADE
);