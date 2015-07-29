package net.minecraft.network.login;

import java.io.IOException;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;
import net.minecraft.network.PacketHandlerLoginClientbound;

public class PacketLoginCompression implements Packet {

   private int a;


   public PacketLoginCompression() {}

   public PacketLoginCompression(int arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) throws IOException {
      this.a = in.readVarInt();
   }

   public void write(PacketByteBuf out) throws IOException {
      out.writeVarInt(this.a);
   }

   public void handle(PacketHandlerLoginClientbound handler) {
      handler.handle(this);
   }

   public int a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler handler) {
      this.handle((PacketHandlerLoginClientbound)handler);
   }
}
