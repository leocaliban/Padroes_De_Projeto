
package Adapter.Exemplo2;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author Leocaliban
 */
public class IteratorEnumeration implements Enumeration {
    private Iterator iterator;
    
    public IteratorEnumeration(Iterator i){
        this.iterator = i;
    }

    @Override
    public boolean hasMoreElements() {
        return this.iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return this.iterator.next();
    }
    
    public static void main(String []args){
        ArrayList <Enumeration> e;
        e = new ArrayList <>();
        Iterator Iterator = null;
        Enumeration ae = new IteratorEnumeration(Iterator);
        e.add(ae);
    }
}
