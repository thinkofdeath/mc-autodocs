import io.netty.buffer.ByteBuf;

public class PacketClientbound3F extends fr {

   private String a;
   private byte[] b;


   public PacketClientbound3F() {}

   public PacketClientbound3F(String var1, ByteBuf var2) {
      this(var1, var2.array());
   }

   public PacketClientbound3F(String var1, byte[] var2) {
      this.a = var1;
      this.b = var2;
      if(var2.length >= 32767) {
         throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
      }
   }

   public void read(PacketBuffer var1) {
      this.a = var1.readString(20);
      this.b = new byte[var1.readUnsignedShort()];
      var1.readBytes(this.b);
   }

   public void write(PacketBuffer var1) {
      var1.writeString(this.a);
      var1.writeShort(this.b.length);
      var1.writeBytes(this.b);
   }

   public void a(ft var1) {
      var1.a(this);
   }
}
