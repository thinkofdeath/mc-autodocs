class PacketClientbound1C {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
        b = rn.b(buffer);
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
        rn.a(b, buffer);
    }
}