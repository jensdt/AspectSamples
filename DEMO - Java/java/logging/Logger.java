package logging;

import java.lang.*;
import hrm.*;

public class Logger extends java.lang.Object {
     private Logger() {
    }

    static private Logger instance = new Logger();

    static public Logger instance() {
        return instance;
    }

    public short advice_hfbkbsgg_odcmzcib(int _$expr, java.lang.Object _$callee) {
        boolean _$puwmrmjk = int.class.isAssignableFrom(int.class);
        if(!(_$puwmrmjk)) {
            return ((short)(_$expr));
        }
        Object _$tmp_argument = _$expr;
        int i = ((int)(((java.lang.Integer)(_$tmp_argument))));
        boolean _$clgagvba = (i) > (Short.MAX_VALUE);
        boolean _$qvztmweu = AspectConfiguration.ENABLE_OVERFLOW;
        boolean _$potzqvtf = (_$clgagvba) && (_$qvztmweu);
        if(!(_$potzqvtf)) {
            return ((short)(_$expr));
        }
        System.out.println((("-- Short would overflow: setting integer ") + (i)) + (". Setting to max value instead."));
        return ((short)(Short.MAX_VALUE));
    }

    private <T>T proceed(Object _$object, String _$methodName, Object[] _$arguments, Class[] _$types) throws Throwable {
        Class invocationClass;
        if((_$object instanceof Class)) {
            invocationClass = ((Class)(_$object));
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
        throw new Error();
    }

    public <T>T advice_jsjqocot_objkpwku(Object _$object, String _$methodName, Object[] _$arguments, Object _$callee) {
        try {
            boolean _$bobeultg = ((_$arguments.length) == (1)) && ((_$arguments[0] instanceof java.lang.Integer));
            if(!(_$bobeultg)) {
                return Logger.instance().<T>proceed(_$object, _$methodName, _$arguments, new Class[]{int.class});
            }
        }
        catch (RuntimeException unchecked) {
            throw unchecked;
        }
        catch (Throwable thrwbl) {
            ;
        }
        int i = ((java.lang.Integer)(_$arguments[0]));
        try {
            System.out.println(("-- Demo started: running test number ") + (i));
            return Logger.instance().<T>proceed(_$object, _$methodName, _$arguments, new Class[]{int.class});
        }
        catch (java.lang.RuntimeException unchecked) {
            throw unchecked;
        }
        catch (Throwable thrwbl) {
            ;
        }
        throw new Error();
    }

    public <T>T advice_pikkgszc_qupgzqjs(Object _$object, String _$methodName, Object[] _$arguments, Object _$callee) throws PersonAlreadyAssignedException {
        try {
            boolean _$dctkjslj = ((_$arguments.length) == (1)) && ((_$arguments[0] instanceof hrm.Person));
            boolean _$ddhrcrzq = hrm.Team.class.isAssignableFrom(_$object.getClass());
            boolean _$hseqothw = (_$dctkjslj) && (_$ddhrcrzq);
            if(!(_$hseqothw)) {
                return Logger.instance().<T>proceed(_$object, _$methodName, _$arguments, new Class[]{hrm.Person.class});
            }
        }
        catch (RuntimeException unchecked) {
            throw unchecked;
        }
        catch (PersonAlreadyAssignedException ex0) {
            throw ex0;
        }
        catch (Throwable thrwbl) {
            ;
        }
        Person p = ((Person)(_$arguments[0]));
        Object _$tmp_thistype = _$object;
        Team t = ((Team)(_$tmp_thistype));
        try {
            boolean _$mggttckk = p.hasTeam();
            boolean _$evaqkkpe = AspectConfiguration.ENABLE_REASSIGN;
            boolean _$hqhuoalk = (_$mggttckk) && (_$evaqkkpe);
            if(!(_$hqhuoalk)) {
                return Logger.instance().<T>proceed(_$object, _$methodName, _$arguments, new Class[]{hrm.Person.class});
            }
        }
        catch (RuntimeException unchecked) {
            throw unchecked;
        }
        catch (PersonAlreadyAssignedException ex0) {
            throw ex0;
        }
        catch (Throwable thrwbl) {
            ;
        }
        try {
            System.out.println((((((("Person ") + (p.getName())) + (" is already in team ")) + (p.getTeam().getName())) + (", not team ")) + (t.getName())) + ("! Removing him..."));
            p.getTeam().removePerson(p);
            return Logger.instance().<T>proceed(_$object, _$methodName, _$arguments, new Class[]{hrm.Person.class});
        }
        catch (java.lang.RuntimeException unchecked) {
            throw unchecked;
        }
        catch (hrm.PersonAlreadyAssignedException ex0) {
            throw ex0;
        }
        catch (Throwable thrwbl) {
            ;
        }
        throw new Error();
    }

}