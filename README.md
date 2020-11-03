# hazelcast-demo
hazelcast-demo Spring-boot Application, in memory distributed caching

# Need for Hazelcast

![alt text](https://www.codeusingjava.com/hazel1-3-min.JPG)

Suppose a request comes in and banking application 1 inserts the data and also updates it cache. But how will banking application 2 and application 3 know about this cache update. They are not aware of this transaction. Also suppose banking application 1 has    modified/deleted an account. Again application 2 and application 3 will then have stale or wrong data in their cache now.
    To resolve these problems we make use of distributed in memory cache i.e Hazelcast
    
![alt text](https://www.codeusingjava.com/hazel1-4-min.JPG)

The goal of In-Memory Data Grids (IMDG) is to provide extremely high availability of data by keeping it in memory and in highly distributed fashion. The advantages of Hazelcast are as follows-
1- Clustering - Hazelcast has a clustered set of Nodes that work in unison
2- Distributed - The data in Hazelcast is distributed in all the nodes

