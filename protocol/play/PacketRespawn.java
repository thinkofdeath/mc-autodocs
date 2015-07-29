package net.minecraft.network.play;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketRespawn implements Packet {

   private int a;
   private om b;
   private aeq$a c;
   private aes d;


   public PacketRespawn() {}

   public PacketRespawn(int arg_0, om arg_1, aes arg_2, aeq$a arg_3) {
      this.a = arg_0;
      this.b = arg_1;
      this.c = arg_3;
      this.d = arg_2;
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readInt();
      this.b = om.a(in.readUnsignedByte());
      this.c = aeq$a.a(in.readUnsignedByte());
      this.d = aes.a(in.readString(16));
      if(this.d == null) {
         this.d = aes.b;
      }

   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeInt(this.a);
      out.writeByte(this.b.a());
      out.writeByte(this.c.a());
      out.writeString(this.d.a());
   }

   public int a() {
      return this.a;
   }

   public om b() {
      return this.b;
   }

   public aeq$a c() {
      return this.c;
   }

   public aes d() {
      return this.d;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
