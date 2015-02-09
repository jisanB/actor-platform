package im.actor.model.api;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import com.droidkit.bser.Bser;
import com.droidkit.bser.BserObject;
import com.droidkit.bser.BserValues;
import com.droidkit.bser.BserWriter;
import java.io.IOException;
import im.actor.model.network.parser.*;
import java.util.List;
import java.util.ArrayList;

public class TextMessage extends BserObject {

    private String text;
    private int extType;
    private byte[] ext;

    public TextMessage(String text, int extType, byte[] ext) {
        this.text = text;
        this.extType = extType;
        this.ext = ext;
    }

    public TextMessage() {

    }

    public String getText() {
        return this.text;
    }

    public int getExtType() {
        return this.extType;
    }

    public byte[] getExt() {
        return this.ext;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.text = values.getString(1);
        this.extType = values.getInt(2);
        this.ext = values.optBytes(3);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        if (this.text == null) {
            throw new IOException();
        }
        writer.writeString(1, this.text);
        writer.writeInt(2, this.extType);
        if (this.ext != null) {
            writer.writeBytes(3, this.ext);
        }
    }

}
