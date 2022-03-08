#### Enum & Stream API & Lambda Expressions
---
##### Enum

```
public enum Example(){
    
    instance1(1, "Instance1 is constructed in this way");
    
    private int a;
    private string b;
    
    // Constructor is private
    private Example(int a, string b){
        this.a = a;
        this.b = b;
    }
    // Getters & Setters
} 

```

##### Stream & Lambda

```
anyList.forEach(item -> item.wantedBehavor());
anyMap.forEach((key,value) -> whatever will be one with the key and value)

//Creates a sublist with given constraint
anyList.stream.filter(t -> constraint).toList();

```

There are lots of methods of stream api to be checked.
