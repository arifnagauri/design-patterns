Composite is a structural design pattern that lets you compose objects into tree structures and 
then work with these structures as if they were individual objects.

Note: Using the Composite pattern makes sense only when the core model of your app can be represented as a tree.
for example mostly relevant for GUI components

There is one independent object (called leaf) and a composite object (which contains independent objects and/or 
other composite objects as its children) share a common interface.
Hence, use this pattern when you want the client code to treat both simple and complex elements uniformly.



