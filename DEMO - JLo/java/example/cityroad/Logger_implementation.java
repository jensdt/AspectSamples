package example.cityroad;

import java.lang.*;
import jlo.association.*;

public class Logger_implementation extends java.lang.Object implements example.cityroad.Logger {
     public Logger_implementation() {
        super();
    }

    static public Logger instance = new example.cityroad.Logger_implementation();

    static public Logger instance() {
        return instance;
    }

    public jlo.association.Property<java.lang.Integer> advice_fepctmya_dpieodtr(example.cityroad.City _$expr, java.lang.Object _$callee) {
        boolean _$aewutjaw = example.cityroad.City.class.isAssignableFrom(_$expr.getClass());
        if(!(_$aewutjaw)) {
            return _$expr.inhabitants__component__lkjkberfuncye__();
        }
        java.lang.Object _$tmp_thistype = _$expr;
        example.cityroad.City c = ((example.cityroad.City)(_$tmp_thistype));
        c.inhabitants__component__lkjkberfuncye__().setValue(new java.lang.Integer(95000));
        return _$expr.inhabitants__component__lkjkberfuncye__();
    }

    public <T>T proceed(Object _$object, String _$methodName, java.lang.Object[] _$arguments, java.lang.Class[] _$types) throws java.lang.Throwable {
        java.lang.Class invocationClass;
        if((_$object instanceof java.lang.Class)) {
            invocationClass = ((java.lang.Class)(_$object));
        }
        else {
            invocationClass = _$object.getClass();
        }
        try {
            java.lang.reflect.Method m = invocationClass.getMethod(_$methodName, _$types);
            return ((T)(m.invoke(_$object, _$arguments)));
        }
        catch (IllegalArgumentException iarg) {
        }
        catch (SecurityException se) {
        }
        catch (IllegalAccessException iac) {
        }
        catch (java.lang.reflect.InvocationTargetException invo) {
            throw invo.getCause();
        }
        catch (NoSuchMethodException nsm) {
            try {
                java.lang.reflect.Method m = invocationClass.getMethod(_$methodName, _$types);
                return ((T)(m.invoke(_$object, _$arguments)));
            }
            catch (IllegalArgumentException iarg) {
            }
            catch (SecurityException se) {
            }
            catch (IllegalAccessException iac) {
            }
            catch (java.lang.reflect.InvocationTargetException invo) {
                throw invo.getCause();
            }
            catch (NoSuchMethodException nsm_inner) {
            }
        }
        throw new java.lang.Error();
    }

    public <T>T advice_edzaaygw_fzdoczvr(Object _$object, String _$methodName, java.lang.Object[] _$arguments, Object _$callee) {
        try {
            System.out.println("Calling getValue");
            return Logger_implementation.instance().<T>proceed(_$object, _$methodName, _$arguments, new java.lang.Class[]{});
        }
        catch (java.lang.RuntimeException unchecked) {
            throw unchecked;
        }
        catch (Throwable thrwbl) {
            ;
        }
        throw new java.lang.Error();
    }

    public <T>T advice_gedvmfvz_uguuprgo(Object _$object, String _$methodName, java.lang.Object[] _$arguments, Object _$callee) {
        try {
            boolean _$gbmehrlg = ((_$arguments.length) == (1)) && ((_$arguments[0] instanceof example.cityroad.City));
            boolean _$wvwovcfl = example.cityroad.City.class.isAssignableFrom(_$object.getClass());
            boolean _$uuadamza = (_$gbmehrlg) && (_$wvwovcfl);
            if(!(_$uuadamza)) {
                return Logger_implementation.instance().<T>proceed(_$object, _$methodName, _$arguments, new java.lang.Class[]{example.cityroad.City.class});
            }
        }
        catch (RuntimeException unchecked) {
            throw unchecked;
        }
        catch (Throwable thrwbl) {
            ;
        }
        java.lang.Object _$tmp_thistype = _$object;
        example.cityroad.City from = ((example.cityroad.City)(_$tmp_thistype));
        example.cityroad.City to = ((example.cityroad.City)(_$arguments[0]));
        try {
            System.out.println(((("Checking canReach: ") + (from)) + (" to ")) + (to));
            return Logger_implementation.instance().<T>proceed(_$object, _$methodName, _$arguments, new java.lang.Class[]{example.cityroad.City.class});
        }
        catch (java.lang.RuntimeException unchecked) {
            throw unchecked;
        }
        catch (Throwable thrwbl) {
            ;
        }
        throw new java.lang.Error();
    }

    public <T>T advice_gedvmfvz_xbfwkbji(Object _$object, String _$methodName, java.lang.Object[] _$arguments, Object _$callee) {
        try {
            boolean _$fsdgpbkq = ((_$arguments.length) == (1)) && ((_$arguments[0] instanceof example.cityroad.City));
            boolean _$vhsdlofz = example.cityroad.City.class.isAssignableFrom(_$object.getClass());
            boolean _$mcydbpac = (_$fsdgpbkq) && (_$vhsdlofz);
            if(!(_$mcydbpac)) {
                return Logger_implementation.instance().<T>proceed(_$object, _$methodName, _$arguments, new java.lang.Class[]{example.cityroad.City.class});
            }
        }
        catch (RuntimeException unchecked) {
            throw unchecked;
        }
        catch (Throwable thrwbl) {
            ;
        }
        java.lang.Object _$tmp_thistype = _$object;
        example.cityroad.City from = ((example.cityroad.City)(_$tmp_thistype));
        example.cityroad.City to = ((example.cityroad.City)(_$arguments[0]));
        try {
            System.out.println(((("Checking canReach: ") + (from)) + (" to ")) + (to));
            return Logger_implementation.instance().<T>proceed(_$object, _$methodName, _$arguments, new java.lang.Class[]{example.cityroad.City.class});
        }
        catch (java.lang.RuntimeException unchecked) {
            throw unchecked;
        }
        catch (Throwable thrwbl) {
            ;
        }
        throw new java.lang.Error();
    }

}