class PacketClientbound17 {
    public void read(Buffer buffer)
    {
        a = buffer.readInt();
    }
    public void write(Buffer buffer)
    {
        buffer.writeInt(a);
    }
}