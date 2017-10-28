# CrystalKeyItemRandomizer

A key item randomizer for Pokemon Crystal.

## Gameplay Changes

    - The important battle on Route 30, which previously was only
      cleared after delivering the Mystery Egg to Professor Elm, has
      been removed, and it is no longer necessary to return the
      Mystery Egg to Professor Elm.
    - The Magnet Train is always running; it is no longer necessary to
      fix the Kanto Power Plant in order to restore train service, and
      the player may travel between Johto and Kanto by train as soon
      as they obtain the `PASS`.
    - The Fast Ship S.S. Aqua is always running; it is no longer
      necessary to wait for a certain day of the week in order to
      travel between Johto and Kanto by ship, which the player may do
      as soon as they obtain the `PASS`.

## Logic

### Ensure that it's always possible to make progress

A 'required key item' is any key item that is itself required or
provides access to a key item that is required.

    - The `S.S.TICKET` will not be replaced with any required key item.
    - If there is any required key item in Kanto, then the `PASS` or
      `S.S.TICKET` will be found in Johto.
    - The player will not be blocked by either the tree in Ilex
      Forest, or by Sudowoodo.
    - `HM03` will not be found in any location that is only reachable
      after acquiring `HM03`.

## Installation

If [available in Hex](https://hex.pm/docs/publish), the package can be installed
by adding `crystal_key_item_randomizer` to your list of dependencies in `mix.exs`:

```elixir
def deps do
  [
    {:crystal_key_item_randomizer, "~> 0.1.0"}
  ]
end
```

Documentation can be generated with [ExDoc](https://github.com/elixir-lang/ex_doc)
and published on [HexDocs](https://hexdocs.pm). Once published, the docs can
be found at [https://hexdocs.pm/crystal_key_item_randomizer](https://hexdocs.pm/crystal_key_item_randomizer).

