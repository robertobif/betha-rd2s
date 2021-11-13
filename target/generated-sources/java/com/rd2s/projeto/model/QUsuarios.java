package com.rd2s.projeto.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUsuarios is a Querydsl query type for Usuarios
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUsuarios extends EntityPathBase<Usuarios> {

    private static final long serialVersionUID = 194311587L;

    public static final QUsuarios usuarios = new QUsuarios("usuarios");

    public final com.rd2s.projeto.enterprise.QAbstractEntity _super = new com.rd2s.projeto.enterprise.QAbstractEntity(this);

    public final StringPath emailRecuperacao = createString("emailRecuperacao");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath Login = createString("Login");

    public final StringPath Nome = createString("Nome");

    public final StringPath Senha = createString("Senha");

    public QUsuarios(String variable) {
        super(Usuarios.class, forVariable(variable));
    }

    public QUsuarios(Path<? extends Usuarios> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUsuarios(PathMetadata metadata) {
        super(Usuarios.class, metadata);
    }

}

