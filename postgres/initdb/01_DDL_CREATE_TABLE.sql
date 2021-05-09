CREATE TABLE publisher (
    pub_id INT PRIMARY KEY,
    pub_name VARCHAR(50) NOT NULL,
    pass VARCHAR(50) NOT NULL
);

CREATE TABLE subscriber (
    sub_id INT PRIMARY KEY,
    sub_name VARCHAR(128) NOT NULL
);

CREATE TABLE topic (
    topic_id SERIAL PRIMARY KEY,
    pub_id INT NOT NULL,
    topic_name VARCHAR(50) NOT NULL
);

CREATE SEQUENCE message_id_seq;
CREATE TABLE message (
    msg_id INT PRIMARY KEY,
    topic_id INT,
    msg_content VARCHAR(128) NOT NULL
);

CREATE TABLE subscriber_topic (
    sub_id INT NOT NULL,
    topic_id INT NOT NULL,
    PRIMARY KEY(sub_id, topic_id)
);

CREATE TABLE subscriber_msg (
    sub_id INT NOT NULL,
    msg_id INT NOT NULL,
    acked BOOLEAN DEFAULT FALSE,
    PRIMARY KEY(sub_id, msg_id)
);