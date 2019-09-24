package com.workshop.churroscuchito.DTO;

import com.workshop.churroscuchito.models.DetalleUsuario;
import com.workshop.churroscuchito.models.Usuario;

public class UsuarioDTO {
	
	private Usuario usuario;
	private DetalleUsuario detalleusuario;
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public DetalleUsuario getDetalleusuario() {
		return detalleusuario;
	}
	public void setDetalleusuario(DetalleUsuario detalleusuario) {
		this.detalleusuario = detalleusuario;
	}
}
