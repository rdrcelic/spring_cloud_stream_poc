# timeticker - message publisher

This is spring boot application that demonstrates implementation of spring-cloud-stream *source*.
This is simple message publisher that may fire messages at fixed rate (like every second),
or via http get on http://localhost:8082/fireTimeTick. Message payload is java.util.Date
timestamp serialized to string.

# Configuration

Application is using RabbitMQ binder, you may configure your own.
For my tests I'm using vagrant box with RabbitMQ with following configuration
~~~~
rabbitmq-dev:
          type: rabbit
          environment:
            spring:
              rabbitmq:
                host: 192.168.10.12
                username: vagrant
                password: vagrant
                virtual-host: DEV
~~~~
Please change these settings after your environment.

You may change the application port
~~~~
server:
  port: 8082
~~~~

# How it works

**TimeTickSource** declares channel *time_tick*.
**TimeTickGenerator** is in charge to generate message. It binds it to the *time_tick* channel with @EnableBinding annotation.
It publishes messages at fixed rate 1 sec. via timeTickMessageSource() annotated with @InboundChannelAdapter.
**TimeTickController** exposes endpoint *fireTimeTick* to trigger message generation via http get.


