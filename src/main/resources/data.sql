INSERT INTO pricingstrategy (strategykey, strategyvalue) VALUES
  ('FREE', 'Free Courses'),
  ('ONETIME', 'One Time Payment'),
  ('SUBSCRIPTION', 'Subscription Model');


INSERT INTO course (coursename,pricingstrategy) VALUES
  ('Python Getting Started','Free Courses'),
  ('Advanced Python','One Time Payment'),
  ('Getting Started with Spark','Subscription Model');

INSERT INTO user (firstname, lastname, email,location) VALUES
  ('Sundar', 'Pichai', 'sundar@google.com','INDIA'),
  ('Jeff', 'Bezos', 'jeff@amazon.com','US'),
  ('Bard', 'Smith', 'brad@intuit.com','INDIA'),
  ('Susan', 'Wojcicki', 'susan@youtube.com','INDIA');


INSERT INTO usercourse (courseid, userid) VALUES
    (1,1),
    (1,2),
    (1,3),
    (2,3),
    (3,1);


INSERT INTO pricingdetail (courseid, baseprice, taxes,other, location) VALUES
    (1,100, 10, 15,'INDIA'),
     (1,100, 15, 20,'US'),
      (2, 200, 20, 25,'INDIA'),
    (2, 200, 20, 25,'US');



