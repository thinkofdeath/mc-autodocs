package net.minecraft.network.play;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerPlayClientbound;

public class PacketJoinGame implements Packet {

   private int a;
   private boolean b;
   private aqu c;
   private int d;
   private vq e;
   private int f;
   private aqw g;
   private boolean h;


   public PacketJoinGame() {}

   public PacketJoinGame(int arg_0, aqu arg_1, boolean arg_2, int arg_3, vq arg_4, int arg_5, aqw arg_6, boolean arg_7) {
      this.a = arg_0;
      this.d = arg_3;
      this.e = arg_4;
      this.c = arg_1;
      this.f = arg_5;
      this.b = arg_2;
      this.g = arg_6;
      this.h = arg_7;
   }

   public void read(PacketByteBuf in) {
      this.a = in.readInt();
      short var2 = in.readUnsignedByte();
      this.b = (var2 & 8) == 8;
      int var3 = var2 & -9;
      this.c = aqu.a(var3);
      this.d = in.readByte();
      this.e = vq.a(in.readUnsignedByte());
      this.f = in.readUnsignedByte();
      this.g = aqw.a(in.readString(16));
      if(this.g == null) {
         this.g = aqw.b;
      }

      this.h = in.readBoolean();
   }

   public void write(PacketByteBuf out) {
      out.writeInt(this.a);
      int var2 = this.c.a();
      if(this.b) {
         var2 |= 8;
      }

      out.writeByte(var2);
      out.writeByte(this.d);
      out.writeByte(this.e.a());
      out.writeByte(this.f);
      out.writeString(this.g.a());
      out.writeBoolean(this.h);
   }

   public void handle(PacketHandlerPlayClientbound handler) {
      handler.handle(this);
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerPlayClientbound)handler);
   }
}
