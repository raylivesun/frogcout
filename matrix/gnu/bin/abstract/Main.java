import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractAction;

public class Main extends AbstractAction {

    public Main() {
          System.out.println("Hello, World!");
       }

   @Override
public void actionPerformed(ActionEvent arg0) {
    // general action for the main action bar
    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
}

@Override
public String toString() {
    return "Main []";
}

@Override
public synchronized void addPropertyChangeListener(PropertyChangeListener listener) {
    // Auto-generated method stub
    super.addPropertyChangeListener(listener);
}

@Override
public Object[] getKeys() {
    // Auto-generated method stub
    return super.getKeys();
}

@Override
public synchronized PropertyChangeListener[] getPropertyChangeListeners() {
    // Auto-generated method stub
    return super.getPropertyChangeListeners();
}

@Override
public Object getValue(String key) {
    // Auto-generated method stub
    return super.getValue(key);
}

@Override
public boolean isEnabled() {
    // Auto-generated method stub
    return super.isEnabled();
}

@Override
public void putValue(String key, Object newValue) {
    //  Auto-generated method stub
    super.putValue(key, newValue);
}

@Override
public void setEnabled(boolean newValue) {
    // Auto-generated method stub
    super.setEnabled(newValue);
}

@Override
public boolean equals(Object obj) {
    // Auto-generated method stub
    return super.equals(obj);
}

@Override
public int hashCode() {
    // Auto-generated method stub
    return super.hashCode();
}

@Override
public boolean accept(Object sender) {
    // Auto-generated method stub
    return super.accept(sender);
}

@Override
protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
    // Auto-generated method stub
    super.firePropertyChange(propertyName, oldValue, newValue);
}

@SuppressWarnings("removal")
@Override
protected void finalize() throws Throwable {
    // Auto-generated method stub
    super.finalize();
}

@Override
protected Object clone() throws CloneNotSupportedException {
    // Auto-generated method stub
    return super.clone();
}

@Override
public synchronized void removePropertyChangeListener(PropertyChangeListener listener) {
    // Auto-generated method stub
    super.removePropertyChangeListener(listener);
}
} 