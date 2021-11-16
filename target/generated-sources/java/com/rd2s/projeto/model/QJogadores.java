package com.rd2s.projeto.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QJogadores is a Querydsl query type for Jogadores
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QJogadores extends EntityPathBase<Jogadores> {

    private static final long serialVersionUID = -2093317160L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QJogadores jogadores = new QJogadores("jogadores");

    public final com.rd2s.projeto.enterprise.QAbstractRegion _super = new com.rd2s.projeto.enterprise.QAbstractRegion(this);

    public final QClientes cliente;

    public final QEquipes equipe;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath nome = _super.nome;

    //inherited
    public final StringPath populacao = _super.populacao;

    public final QPosicoes posicao;

    public QJogadores(String variable) {
        this(Jogadores.class, forVariable(variable), INITS);
    }

    public QJogadores(Path<? extends Jogadores> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QJogadores(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QJogadores(PathMetadata metadata, PathInits inits) {
        this(Jogadores.class, metadata, inits);
    }

    public QJogadores(Class<? extends Jogadores> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cliente = inits.isInitialized("cliente") ? new QClientes(forProperty("cliente"), inits.get("cliente")) : null;
        this.equipe = inits.isInitialized("equipe") ? new QEquipes(forProperty("equipe"), inits.get("equipe")) : null;
        this.posicao = inits.isInitialized("posicao") ? new QPosicoes(forProperty("posicao")) : null;
    }

}

