package com.rd2s.projeto.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAgenda is a Querydsl query type for Agenda
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAgenda extends EntityPathBase<Agenda> {

    private static final long serialVersionUID = 940092970L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAgenda agenda = new QAgenda("agenda");

    public final com.rd2s.projeto.enterprise.QAbstractRegion _super = new com.rd2s.projeto.enterprise.QAbstractRegion(this);

    public final QClientes cliente;

    public final QHorarios horario;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath nome = _super.nome;

    //inherited
    public final StringPath populacao = _super.populacao;

    public final QQuadras quadra;

    public QAgenda(String variable) {
        this(Agenda.class, forVariable(variable), INITS);
    }

    public QAgenda(Path<? extends Agenda> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAgenda(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAgenda(PathMetadata metadata, PathInits inits) {
        this(Agenda.class, metadata, inits);
    }

    public QAgenda(Class<? extends Agenda> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cliente = inits.isInitialized("cliente") ? new QClientes(forProperty("cliente"), inits.get("cliente")) : null;
        this.horario = inits.isInitialized("horario") ? new QHorarios(forProperty("horario")) : null;
        this.quadra = inits.isInitialized("quadra") ? new QQuadras(forProperty("quadra")) : null;
    }

}

