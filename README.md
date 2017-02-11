# spring_cloud_stream_poc
This is POC usage of spring-cloud-stream that covers some use-cases.

This project aims to display some very basic usage of spring-cloud-stream in event-driven
architecture scenario. For example, message publisher sends messages to message bus and 
message subscribers may receive these for processing, persisting, loggin, or triggering
some further actions. It is interesting to see: 
* how it works to publish message
* what has to be done to subscribe more than one component to the same topic
* how to configure message bus binder
* how different is to configure queue vs. pub-sub
