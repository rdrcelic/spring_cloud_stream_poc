# timelogger - message subscriber(s)

This is spring boot application that demonstrates spring-cloud-stream *sink* and *processor*.
There are various components subscribed to same *time-tick* topic. Each component may do
different processing on received message (e.g. persisting, transforming, loggind, etc.).

# Configuration

Application binds itself to RabittMQ and listens messages on *time-tick* topic comming from **timeticker** application.
Pay attention how configuration enables multiple subsribers to the same topic within same application.

~~~~
cloud:
    stream:
      bindings:
        time_tick:
          destination: timeTick
          contentType: application/json
        time_tick_second:
          destination: timeTick
          contentType: application/json
        time_tick_processor_input:
          destination: timeTick
          contentType: application/json
        time_tick_processor_output:
          destination: timeTickTransformed
          contentType: application/json
        time_tick_transformed:
          destination: timeTickTransformed
          contentType: application/json
~~~~
