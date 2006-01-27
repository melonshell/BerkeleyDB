/*
 * Automatically generated by jrpcgen 0.95.1 on 8/2/05 1:49 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://acplt.org/ks/remotetea.html for details
 */
package com.sleepycat.db.rpcserver;
import org.acplt.oncrpc.*;
import java.io.IOException;

public class __db_rename_msg implements XdrAble {
    public int dbpcl_id;
    public String name;
    public String subdb;
    public String newname;
    public int flags;

    public __db_rename_msg() {
    }

    public __db_rename_msg(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeInt(dbpcl_id);
        xdr.xdrEncodeString(name);
        xdr.xdrEncodeString(subdb);
        xdr.xdrEncodeString(newname);
        xdr.xdrEncodeInt(flags);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        dbpcl_id = xdr.xdrDecodeInt();
        name = xdr.xdrDecodeString();
        subdb = xdr.xdrDecodeString();
        newname = xdr.xdrDecodeString();
        flags = xdr.xdrDecodeInt();
    }

}
// End of __db_rename_msg.java