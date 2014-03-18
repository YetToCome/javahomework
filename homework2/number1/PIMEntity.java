/*************************************************************************
	> File Name: PIMEntity.java
	> Author: WJW
	> Mail: 1971767787@qq.com
	> Created Time: 2014年03月18日 星期二 10时22分09秒
 ************************************************************************/

public abstract class PIMEntity {
    String Priority; // every kind of item has a priority
    String origin_string;

    // default constructor sets priority to "normal"
    PIMEntity() {
        Priority = "normal";
    }

    // priority can be established via this constructor.
    PIMEntity(String priority) {
        Priority =  priority;
    }

    // accessor method for getting the priority string
    public String getPriority() {
        return Priority;
    }
    // method that changes the priority string
    public void setPriority(String p) {
        Priority = p;
    }

    public String getOriginString() {
        return origin_string;
    }
    // Each PIMEntity needs to be able to set all state information
    // (fields) from a single text string.
    abstract public void fromString(String s);

    // This is actually already defined by the super class
    // Object, but redefined here as abstract to make sure
    // that derived classes actually implement it
    abstract public String toString();
}
