CREATE TABLE publisher (
    pub_id VARCHAR(10) PRIMARY KEY,
    pub_name VARCHAR(50) NOT NULL,
    pass VARCHAR(50) NOT NULL
);

CREATE TABLE subscriber (
    sub_id VARCHAR(10) PRIMARY KEY,
    sub_name VARCHAR(128) NOT NULL
);

CREATE TABLE topic (
    topic_id VARCHAR(10) PRIMARY KEY,
    pub_id VARCHAR(10) NOT NULL,
    topic_name VARCHAR(50) NOT NULL
);

CREATE TABLE message (
    msg_id VARCHAR(10) PRIMARY KEY,
    topic_id VARCHAR(10),
    msg_content VARCHAR(128) NOT NULL
);

CREATE TABLE subscriber_topic (
    sub_id VARCHAR(10) NOT NULL,
    topic_id VARCHAR(10) NOT NULL,
    PRIMARY KEY(sub_id, topic_id)
);

CREATE TABLE subscriber_msg (
    sub_id VARCHAR(10) NOT NULL,
    msg_id VARCHAR(10) NOT NULL,
    acked BOOLEAN NOT NULL,
    PRIMARY KEY(sub_id, msg_id)
);