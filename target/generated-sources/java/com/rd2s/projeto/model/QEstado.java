package com.rd2s.projeto.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEstado is a Querydsl query type for Estado
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEstado extends EntityPathBase<Estado> {

    private static final long serialVersionUID = 1066126212L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEstado estado = new QEstado("estado");

    public final com.rd2s.projeto.enterprise.QAbstractRegion _super = new com.rd2s.projeto.enterprise.QAbstractRegion(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath nome = _super.nome;

    public final QPais pais;

    //inherited
    public final StringPath populacao = _super.populacao;

    public QEstado(String variable) {
        this(Estado.class, forVariable(variable), INITS);
    }

    public QEstado(Path<? extends Estado> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEstado(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEstado(PathMetadata metadata, PathInits inits) {
        this(Estado.class, metadata, inits);
    }

    public QEstado(Class<? extends Estado> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.pais = inits.isInitialized("pais") ? new QPais(forProperty("pais")) : null;
    }

}

