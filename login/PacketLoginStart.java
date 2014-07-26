package net.minecraft.network.login;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.PacketHandler;

public class PacketLoginStart implements Packet {

   private GameProfile a;


   public PacketLoginStart() {}

   public PacketLoginStart(GameProfile arg_0) {
      this.a = arg_0;
   }

   public void read(PacketByteBuf in) {
      this.a = new GameProfile((UUID)null, in.readString(16));
   }

   public void write(PacketByteBuf out) {
      out.writeString(this.a.getName());
   }

   public void a(nb arg_0) {
      arg_0.a(this);
   }

   public GameProfile a() {
      return this.a;
   }

   // $FF: synthetic method
   // $FF: bridge method
   public void handle(PacketHandler arg_0) {
      this.a((nb)arg_0);
   }
}