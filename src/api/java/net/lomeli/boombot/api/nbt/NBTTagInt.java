package net.lomeli.boombot.api.nbt;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class NBTTagInt extends NBTTagBase<Integer> {
    private int value;

    public NBTTagInt() {
    }

    public NBTTagInt(int value) {
        this.value = value;
    }

    @Override
    public void write(DataOutput stream) throws IOException {
        stream.writeInt(this.value);
    }

    @Override
    public void read(DataInput stream) throws IOException {
        this.value = stream.readInt();
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public byte getID() {
        return TagType.TAG_INT.getId();
    }
}
