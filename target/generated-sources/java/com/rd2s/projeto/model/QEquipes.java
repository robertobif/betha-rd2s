package com.rd2s.projeto.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEquipes is a Querydsl query type for Equipes
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEquipes extends EntityPathBase<Equipes> {

    private static final long serialVersionUID = -1365910912L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEquipes equipes = new QEquipes("equipes");

    public final com.rd2s.projeto.enterprise.QAbstractEntity _super = new com.rd2s.projeto.enterprise.QAbstractEntity(this);

    public final QClientes cliente;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath Nome = createString("Nome");

    public QEquipes(String variable) {
        this(Equipes.class, forVariable(variable), INITS);
    }

    public QEquipes(Path<? extends Equipes> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEquipes(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEquipes(PathMetadata metadata, PathInits inits) {
        this(Equipes.class, metadata, inits);
    }

    public QEquipes(Class<? extends Equipes> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cliente = inits.isInitialized("cliente") ? new QClientes(forProperty("cliente"), inits.get("cliente")) : null;
    }

}

