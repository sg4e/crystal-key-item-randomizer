defmodule SwapGenerator.Item do
  @enforce_keys [:name, :location]
  defstruct [:name, :location, macro: :verbosegiveitem]
end