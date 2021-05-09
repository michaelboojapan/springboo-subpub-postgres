CREATE TABLE publisher (
    pub_name VARCHAR(50) PRIMARY KEY,
    pass VARCHAR(50) NOT NULL
);

CREATE TABLE subscriber (
    sub_name VARCHAR(50) PRIMARY KEY
);

CREATE TABLE topic (
    topic_name VARCHAR(50) PRIMARY KEY,
    pub_name VARCHAR(50) NOT NULL
);

CREATE TABLE message (
    msg_id INT PRIMARY KEY,
    topic_name VARCHAR(50)  NOT NULL,
    msg_content VARCHAR(128) NOT NULL
);

CREATE TABLE subscriber_topic (
    sub_name VARCHAR(50) NOT NULL,
    topic_name VARCHAR(50) NOT NULL,
    PRIMARY KEY(sub_name, topic_name)
);

CREATE TABLE subscriber_msg (
    sub_name VARCHAR(50) NOT NULL,
    msg_id INT NOT NULL,
    acked BOOLEAN DEFAULT FALSE,
    PRIMARY KEY(sub_name, msg_id)
);